package com.my.practice.sets;

public class Base64 {
	private final static byte[] BASE64_ALPHABET =
		{
			(byte)'A', (byte)'B', (byte)'C', (byte)'D', (byte)'E', (byte)'F', (byte)'G',
			(byte)'H', (byte)'I', (byte)'J', (byte)'K', (byte)'L', (byte)'M', (byte)'N',
			(byte)'O', (byte)'P', (byte)'Q', (byte)'R', (byte)'S', (byte)'T', (byte)'U',
			(byte)'V', (byte)'W', (byte)'X', (byte)'Y', (byte)'Z',
			(byte)'a', (byte)'b', (byte)'c', (byte)'d', (byte)'e', (byte)'f', (byte)'g',
			(byte)'h', (byte)'i', (byte)'j', (byte)'k', (byte)'l', (byte)'m', (byte)'n',
			(byte)'o', (byte)'p', (byte)'q', (byte)'r', (byte)'s', (byte)'t', (byte)'u',
			(byte)'v', (byte)'w', (byte)'x', (byte)'y', (byte)'z',
			(byte)'0', (byte)'1', (byte)'2', (byte)'3', (byte)'4', (byte)'5',
			(byte)'6', (byte)'7', (byte)'8', (byte)'9', (byte)'+', (byte)'/'
		};
		
		/** The BASE64 suffix code */
		private static final byte SUFFIX_CODE = (byte)'=';
		
		/*private Base64()
		{
		}*/
		
		/**
		 * Encode a byte array into BASE64 string.
		 * 
		 * @param a	the source byte array
		 * @return	BASE64 string
		 */
		public static String encode(byte[] a)
		{
			int length = a.length;
			int numOfGroups = length / 3;
			int remainingBytes = length - numOfGroups * 3;
			int resultLength = 4 * ((length+2)/3);
			byte[] result = new byte[resultLength];
			int srcIndex = 0, dstIndex = 0;
			
			for ( int i=0; i<numOfGroups; i++ )
			{
				int byte0 = a[srcIndex++] & 0xff;
				int byte1 = a[srcIndex++] & 0xff;
				int byte2 = a[srcIndex++] & 0xff;
				result[dstIndex++] = BASE64_ALPHABET[byte0 >> 2];
				result[dstIndex++] = BASE64_ALPHABET[(byte0 << 4)&0x30 | (byte1 >> 4)];
				result[dstIndex++] = BASE64_ALPHABET[(byte1 << 2)&0x3c | (byte2 >> 6)];
				result[dstIndex++] = BASE64_ALPHABET[byte2 & 0x3f];
			}
			
			// Process the remaining bytes
			if ( remainingBytes > 0 )
			{
				int byte0 = a[srcIndex++] & 0xff;
				result[dstIndex++] = BASE64_ALPHABET[byte0 >> 2];
				if ( remainingBytes == 1 )
				{
					result[dstIndex++] = BASE64_ALPHABET[(byte0 << 4)&0x30];
					result[dstIndex++] = SUFFIX_CODE;
					result[dstIndex++] = SUFFIX_CODE;
				}
				else
				{
					// remainingBytes == 2;
					int byte1 = a[srcIndex++] & 0xff;
					result[dstIndex++] = BASE64_ALPHABET[(byte0 << 4)&0x30 | (byte1 >> 4)];
					result[dstIndex++] = BASE64_ALPHABET[(byte1 << 2)&0x3f];
					result[dstIndex++] = SUFFIX_CODE;
				}
			}
			
	        return new String(result);
		}
		
		/**
		 * Decode a BASE64 string into byte array.
		 * 
		 * @param s	BASE64 string
		 * @return	the original byte array
		 */
		public static byte[] decode(String s)
		{
			if ( s == null || s.length() == 0 )
			{
				return null;
			}

			int length = s.length();
			// length must be a multiple of 4
			if ( length % 4 != 0 )
			{
				throw new IllegalArgumentException("String length must be a multiple of four.");
			}

			int numOfGroups = length / 4;
			int numOfFullGroups = numOfGroups; 
			int numOfPaddings = 0;
			if ( s.charAt(length-1) == SUFFIX_CODE )
			{
				numOfPaddings ++;
				numOfFullGroups --;
				if ( s.charAt(length-2) == SUFFIX_CODE )
				{
					numOfPaddings ++;
				}
			}
			byte[] result = new byte[3*numOfGroups - numOfPaddings];
			
			int srcIndex = 0, dstIndex = 0;
			for ( int i=0; i<numOfFullGroups; i++ )
			{
				int ch0 = getCharIndex(s.charAt(srcIndex++));
				int ch1 = getCharIndex(s.charAt(srcIndex++));
				int ch2 = getCharIndex(s.charAt(srcIndex++));
				int ch3 = getCharIndex(s.charAt(srcIndex++));
				
				result[dstIndex++] = (byte) ((ch0 << 2) | (ch1 >> 4));
				result[dstIndex++] = (byte) ((ch1 << 4) | (ch2 >> 2));
				result[dstIndex++] = (byte) ((ch2 << 6) | ch3 );
			}

			if ( numOfPaddings != 0 )
			{
				int ch0 = getCharIndex(s.charAt(srcIndex++));
				int ch1 = getCharIndex(s.charAt(srcIndex++));
				result[dstIndex++] = (byte) ((ch0 << 2) | (ch1 >> 4));
				if ( numOfPaddings == 1 )
				{
					int ch2 = getCharIndex(s.charAt(srcIndex++));
					result[dstIndex++] = (byte) ((ch1 << 4) | (ch2 >> 2));
				}
			}
			
	        return result;
		}
		
		/**
		 * Get the index of the character in the BASE64_ALPHABET array.
		 * 
		 * @param c
		 * @return
		 */
		private static int getCharIndex(char c)
		{
			if ( c >= 'A' && c <= 'Z' )			// A-Z: 65-90
			{
				return (int) c - 65;
			}
			else if ( c >= 'a' && c <= 'z' )	// a-z: 97-122
			{
				return (int) c - 71;
			}
			else if ( c >= '0' && c <= '9' )	// 0-9: 48-57
			{
				return (int) c + 4;
			}
			else if ( c == '+' )
			{
				return 62;
			}
			else if ( c == '/')
			{
				return 63;
			}

			throw new IllegalArgumentException("Character " + c + " is not a BASE64 char");
		}
		
		public static void main(String args[]) {
			byte[] b = new byte[]{1,2,3};
			System.out.println(encode(b));
		}
}
