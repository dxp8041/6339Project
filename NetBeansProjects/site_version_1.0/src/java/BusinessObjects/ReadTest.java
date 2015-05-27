/*
* To change this license header, choose License Headers in Project Properties.
* To change this template file, choose Tools | Templates
* and open the template in the editor.
*/
package BusinessObjects;

/**
 *
 * @author dpokhrel
 */
public class ReadTest {
    public static void main(String[] args) {
        RssFeedParser parser = new RssFeedParser("http://www.amazon.com/rss/tag/hip%20hop/new?length=10&tag=bumperartcom-20");
        Feed feed = parser.readFeed();
        int x=0;
        for (FeedMessage message : feed.getMessages()) {
            //System.out.println(message.getTitle());
           // System.out.println(message.getLink());
            System.out.println(message.getDescription());
            
            
            
            
            
        }
        
    }
}

