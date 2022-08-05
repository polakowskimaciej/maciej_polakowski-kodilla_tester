package com.kodilla.collections.adv.exercises.dictionary;

import java.util.*;

public class Dictionary {
    Map<String, List<EnglishWord>> dictionary = new HashMap<>();

    public void addWord(String polishword, EnglishWord englishWord) {
        List<EnglishWord> englishWords = dictionary.getOrDefault(polishword, new ArrayList<>());
        englishWords.add(englishWord);
        dictionary.put(polishword,englishWords);
    }

    public List<EnglishWord> findEnglishWords(String polishword, PartOfSpeech partOfSpeech) {
        List<EnglishWord> result = new ArrayList<>();
        for (EnglishWord englishWord : dictionary.getOrDefault(polishword,Collections.emptyList())) {
            if (englishWord.getPartOfSpeech().equals(partOfSpeech))
                result.add(englishWord);
        }
        return result;
    }
// overload methods
    public List<EnglishWord> findEnglishWords(String polishword) {
        return dictionary.getOrDefault(polishword, Collections.emptyList());
    }
    public int siza(){
        return dictionary.size();
    }

}
