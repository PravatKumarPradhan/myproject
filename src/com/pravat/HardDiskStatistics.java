package com.pravat;

import java.math.BigInteger;
import java.util.*;

public class HardDiskStatistics {

  public static void main(String[] args) {
   String S = "my.song.mp3 11b\n" + "greatSong.flac 1000b\n"
            + "not3.txt 5b\n" + "video.mp4 200b\n" + "game.exe 100b\n"
            + "mov!e.mkv 10000b";
   //String S= "my.song.mp3 11b\\\ngreatSong.flac 1000b\\\nnot3.txt 5b\\\\nvideo.mp4 200b\\\\ngame.exe 100b\\\\nmov!e.mkv";
    System.out.println(solution(S));
  }

  public static String solution(String S) {
    if (S != null && S.trim().length() > 1) {
      SortedSet<String> music = (SortedSet<String>) new HashSet<String>(Arrays.asList("mp3", "aac",
              "flac"));
      Set<String> images = new HashSet<String>(Arrays.asList("jpg",
              "bmp", "gif"));
      Set<String> movies = new HashSet<String>(Arrays.asList("mp4",
              "avi", "mkv"));

      Map<String, BigInteger> files = new HashMap<>();
      files.put("music", new BigInteger("0"));
      files.put("images", new BigInteger("0"));
      files.put("movies", new BigInteger("0"));
      files.put("other", new BigInteger("0"));

      String[] fileWithSizes = S.split("[\n]");

      for (int i = 0; i < fileWithSizes.length; i++) {
        String fileWithSize = fileWithSizes[i].substring(
                fileWithSizes[i].lastIndexOf(".") + 1,
                fileWithSizes[i].length() - 1);
        String[] str = fileWithSize.split("\\s+");
        if (music.contains(str[0])) {
          files.put("music",
                  files.get("music").add(new BigInteger(str[1])));
        } else if (images.contains(str[0])) {
          files.put("images",
                  files.get("images").add(new BigInteger(str[1])));
        } else if (movies.contains(str[0])) {
          files.put("movies",
                  files.get("movies").add(new BigInteger(str[1])));
        } else {
          files.put("other",
                  files.get("other").add(new BigInteger(str[1])));
        }
      }

      return _returnString(files);
    }
    return null;
  }

  private static String _returnString(Map<String, BigInteger> files) {
    StringBuilder strBuilder = new StringBuilder();
    files.forEach((key, value) -> strBuilder.append(key + " " + value + "b\n"));
    return strBuilder.toString();
  }
}