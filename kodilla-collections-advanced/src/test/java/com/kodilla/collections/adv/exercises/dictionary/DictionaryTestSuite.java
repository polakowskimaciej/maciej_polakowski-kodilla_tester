package com.kodilla.collections.adv.exercises.dictionary;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class DictionaryTestSuite {
    @Test
    public void testAddWord() {
        //given
        Dictionary dictionary = new Dictionary();
        String polishWord = "stos";

        EnglishWord englishWord = new EnglishWord(PartOfSpeech.NOUN, "stack");
        // when
        dictionary.addWord(polishWord, englishWord);
        // than
        assertEquals(1, dictionary.siza());

    }

    @Test
    public void testFindEnglishWords() {
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "game"));
        dictionary.addWord("gra", new EnglishWord(PartOfSpeech.NOUN, "play"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
        //when
        List<EnglishWord> result = dictionary.findEnglishWords("gra");
        //then
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "game"));
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "play"));
        assertEquals(expectedList, result);
    }

    @Test
    public void testFindEnglishWord_WithPartOfSpeech() {
        //given
        Dictionary dictionary = new Dictionary();
        dictionary.addWord("stos", new EnglishWord(PartOfSpeech.NOUN, "stack"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        dictionary.addWord("brać", new EnglishWord(PartOfSpeech.VERB, "to take"));
        dictionary.addWord("grać", new EnglishWord(PartOfSpeech.VERB, "play"));
//when
        List<EnglishWord> result = dictionary.findEnglishWords("brać", PartOfSpeech.NOUN);
        //than
        List<EnglishWord> expectedList = new ArrayList<>();
        expectedList.add(new EnglishWord(PartOfSpeech.NOUN, "brotherhood"));
        assertEquals(expectedList, result);
    }

}