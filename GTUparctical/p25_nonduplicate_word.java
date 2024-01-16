
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
public class p25_nonduplicate_word {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide the path to the text file as a command-line argument.");
            return;
        }

        String filePath = args[0];
        List<String> nonDuplicateWords = getNonDuplicateWordsDescending(filePath);

        System.out.println("Non-duplicate words in descending order:");
        for (String word : nonDuplicateWords) {
            System.out.println(word);
        }
    }

    public static List<String> getNonDuplicateWordsDescending(String filePath) {
        List<String> words = new ArrayList<>();
                try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
  while ((line = reader.readLine()) != null) {
                String[] lineWords = line.split("\\s+");
                words.addAll(Arrays.asList(lineWords));
            }
        } catch (IOException e) {
            System.out.println("Error reading the file: " + e.getMessage());
        }

        Map<String, Integer> wordFrequency = new HashMap<>();
        for (String word : words) {
            wordFrequency.put(word, wordFrequency.getOrDefault(word, 0) + 1);
        }

        List<String> nonDuplicateWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordFrequency.entrySet()) {
            if (entry.getValue() == 1) {
                nonDuplicateWords.add(entry.getKey());
            }
        }

        Collections.sort(nonDuplicateWords, Collections.reverseOrder());

        return nonDuplicateWords;
    }
}


