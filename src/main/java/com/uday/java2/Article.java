package com.uday.java2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Article {

    private final String title;
    private final String author;
    private final List<String> tags;

    private Article(String title, String author, List<String> tags) {
        this.title = title;
        this.author = author;
        this.tags = tags;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public List<String> getTags() {
        return tags;
    }
    
    public Article getFirstJavaArticle() {
      List<Article> articles= new ArrayList<>();
      
      for (Article article : articles) {
          if (article.getTags().contains("Java")) {
              return article;
          }
      }

      return null;
  }
    
    public Optional<Article> getFirstJavaArticle1() {  
      List<Article> articles= new ArrayList<>();
      List<String> tags= new ArrayList<String>();
      tags.add("Java2");
      tags.add("Java1");
      articles.add(new Article("Software", "Uday", tags));
      return articles.stream()
          .filter(article -> article.getTags().contains("Java"))
          .findFirst();
      }
    
    public List<Article> getAllJavaArticles() {  
      List<Article> articles= new ArrayList<>();
      List<String> tags= new ArrayList<String>();
      tags.add("Java2");
      tags.add("Java");
      articles.add(new Article("Software", "Uday", tags));
      return articles.stream()
          .filter(article -> article.getTags().contains("Java"))
          .collect(Collectors.toList());
      }
    
    public Map<String, List<Article>> groupByAuthor() {

      Map<String, List<Article>> result = new HashMap<>();
      List<Article> articles= new ArrayList<>();
      List<String> tags= new ArrayList<String>();
      tags.add("Java2");
      tags.add("Java");
      articles.add(new Article("Software", "Uday", tags));
      for (Article article : articles) {
          if (result.containsKey(article.getAuthor())) {
              result.get(article.getAuthor()).add(article);
          } else {
              ArrayList<Article> articles1 = new ArrayList<>();
              articles1.add(article);
              result.put(article.getAuthor(), articles1);
          }
      }

      return result;
  }
    
    public static void main(String args[]){
      List<String> tags= new ArrayList<String>();
      tags.add("Java");
      tags.add("Java1");
      Article article= new Article("Software", "Uday", tags);
      
      System.out.println(article.getTags().size());
      System.out.println(article.getFirstJavaArticle1());
      System.out.println(article.getAllJavaArticles());
      System.out.println(article.groupByAuthor());
    }
}