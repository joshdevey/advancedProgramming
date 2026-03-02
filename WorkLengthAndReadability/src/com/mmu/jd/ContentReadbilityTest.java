package com.mmu.jd;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

class ContentReadbilityTest {

	@Test
	void testContent() {
		ContentReadability contentReadability = new ContentReadability("The hills are alive to the sound of music. More than on");
		assertEquals(12, contentReadability.getWords());
		assertEquals(43, contentReadability.getCharacters());
		assertEquals(2, contentReadability.getSentences());
		assertEquals(11, contentReadability.getSyllables());
		
		
		assertEquals(5.475, contentReadability.calculateARI(), 1);
//		assertEquals(2.89, contentReadability.calculateFleschKincaidScore(), 1);
		
	}

}
