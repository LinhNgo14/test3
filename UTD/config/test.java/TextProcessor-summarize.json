package text;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TextProcessor {

    private final Pattern sentenceSplit;
    private final Set<String> stopwords;

    public TextProcessor() {
        this.sentenceSplit = Pattern.compile("(?<=[.!?])\\s+");

        this.stopwords = new HashSet<>(Arrays.asList(
                "the", "and", "is", "in", "to", "of", "a",
                "for", "on", "with", "that", "this", "it"
        ));
    }

    public String summarize(String text, int n) {

        String[] rawSentences = sentenceSplit.split(text);
        List<String> sentences = new ArrayList<>();

        for (String s : rawSentences) {
            String trimmed = s.trim();
            if (!trimmed.isEmpty()) {
                sentences.add(trimmed);
            }
        }

        if (sentences.isEmpty()) {
            return "";
        }

        List<String> words = extractWords(text.toLowerCase());

        Map<String, Integer> freqs = new HashMap<>();
        for (String w : words) {
            if (!stopwords.contains(w)) {
                freqs.put(w, freqs.getOrDefault(w, 0) + 1);
            }
        }

        if (freqs.isEmpty()) {
            return String.join(" ", sentences.subList(0, Math.min(n, sentences.size())));
        }

        List<SentenceScore> scored = new ArrayList<>();

        for (String sentence : sentences) {
            List<String> sentenceWords = extractWords(sentence.toLowerCase());
            int score = 0;
            for (String w : sentenceWords) {
                score += freqs.getOrDefault(w, 0);
            }
            scored.add(new SentenceScore(score, sentence));
        }

        scored.sort((a, b) -> Integer.compare(b.score, a.score));
        List<SentenceScore> top = scored.subList(0, Math.min(n, scored.size()));

        top.sort(Comparator.comparingInt(a -> sentences.indexOf(a.sentence)));

        List<String> finalSentences = new ArrayList<>();
        for (SentenceScore sc : top) {
            finalSentences.add(sc.sentence);
        }

        return String.join(" ", finalSentences);
    }

    private List<String> extractWords(String text) {
        List<String> list = new ArrayList<>();
        Matcher m = Pattern.compile("\\w+").matcher(text);
        while (m.find()) {
            list.add(m.group());
        }
        return list;
    }

    private static class SentenceScore {
        int score;
        String sentence;

        SentenceScore(int score, String sentence) {
            this.score = score;
            this.sentence = sentence;
        }
    }

    public static void main(String[] args) {
        TextProcessor t = new TextProcessor();
        String text = "Machine learning is AI. It helps computers learn from data. Used in vision, NLP, recommendation.";
        System.out.println(t.summarize(text, 2));
    }
}
