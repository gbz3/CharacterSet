package com.github.gbz3.characterset;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class CharacterSetTest {

	@Test
	public void testJISX0201() {
		final CharacterSet set = CharacterSet.getInstance();
		assertEquals( false, set.is( '\u0019', CharacterSet.Enable.JISX0201 ) );
		assertEquals( true, set.is( ' ', CharacterSet.Enable.JISX0201 ) );
		assertEquals( true, set.is( '}', CharacterSet.Enable.JISX0201 ) );
		assertEquals( true, set.is( '\u203E', CharacterSet.Enable.JISX0201 ) );		// OVER LINE
		assertEquals( false, set.is( '\u007F', CharacterSet.Enable.JISX0201 ) );
		assertEquals( true, set.is( '｡', CharacterSet.Enable.JISX0201 ) );
		assertEquals( true, set.is( 'ﾟ', CharacterSet.Enable.JISX0201 ) );
	}

	@Test
	public void testJISX0208() {
		final CharacterSet set = CharacterSet.getInstance();
		assertEquals( false, set.is( '1', CharacterSet.Enable.JISX0208 ) );
		assertEquals( true, set.is( '１', CharacterSet.Enable.JISX0208 ) );
		assertEquals( false, set.is( '①', CharacterSet.Enable.JISX0208 ) );
		assertEquals( false, set.is( '～', CharacterSet.Enable.JISX0208 ) );
	}

}
