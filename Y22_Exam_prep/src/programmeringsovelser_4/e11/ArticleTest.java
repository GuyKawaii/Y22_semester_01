package programmeringsovelser_4.e11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArticleTest {
  @Test
  public void longBody() {
    String body = """
        Lav en klasse Article der har tre attributter: headingtest-kode der sætter alle tre attributter, og sørg for at , body og author. Lav body er en lang tekst – f.eks. indholdet af denne øvelsesbeskrivelse!
        
        Tilføj en metode getLongestWord, der returnerer det længste ord (længste sekvens af bogstaver uden tegn) fra body.
        
        Tilføj en metode getWords, der returnerer en liste af alle ord fra body, men hvor hvert ord kun forekommer en enkelt gang.
        """;
    String author = "author";
    
    Article article = new Article("heading", body, author);
    
    assertEquals(body, article.getBody());
    assertEquals(author, article.getAuthor());
  }
}