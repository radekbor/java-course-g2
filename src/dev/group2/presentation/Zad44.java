package dev.group2.presentation;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zad44 {
    public static void main(String[] args) throws IOException {

//        Scanner scanner = new Scanner(System.in);
//        List<String> lista = new ArrayList<>();
//        while(scanner.hasNext()) {
//            String s = scanner.next();
//            lista.add(s);
//            if (s.length() == 1 && s.charAt(0) == 'e') {
//                System.out.println("Koniec");
//                break;
//            }
//        }
//        System.out.println(lista);

        String path = "/Users/radoslawborowiecki/Work/test/group2/src/dev/group2/practices/day6/tasks";

        try (Scanner scanner2 = new Scanner(new File(path))){
            while (scanner2.hasNext()) {
                System.out.println(scanner2.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        Path p = FileSystems.getDefault().getPath(path);
        Files.readAllLines(p).forEach(
                line -> System.out.println(line));
    }
}
