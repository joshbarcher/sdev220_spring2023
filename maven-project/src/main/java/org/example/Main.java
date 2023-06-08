package org.example;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class Main
{
    public static void main(String[] args)
    {
        try
        {
            Document doc = Jsoup.connect("https://en.wikipedia.org/").get();
            System.out.println(doc.title());

            Elements pageElements = doc.getAllElements();
            for (Element singleElement : pageElements)
            {
                System.out.println("Found a " + singleElement.tagName());

                String tagContents = singleElement.text();
                System.out.println("Text inside tag - " + tagContents);
            }
        }
        catch (IOException ex)
        {
            System.out.println("Error downloading web document: " + ex.getMessage());
        }
    }
}