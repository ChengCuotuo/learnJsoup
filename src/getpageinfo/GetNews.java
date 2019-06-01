package getpageinfo;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GetNews {
    public static void main(String[] args) throws IOException {
        String  url = "https://news.sina.com.cn/";
        // Document doc = Jsoup.connect(url).get();
        Document doc = Jsoup.connect(url).get(); // 设置等待超时时间
        Elements eles = doc.getElementsByClass("main-nav");     // 获取指定的元素
        for (Element e : eles) {
            Elements links = e.select("a[href]");   // select 是选择器
            for (Element link : links) {
                Element b = link.getElementsByTag("b").first(); //获取第一个节点
                if (b != null) {
                     System.out.println(b.text());    // 获取该节点的文本值
                     System.out.println(link.attr("href")); // 获取超链接的内容
                }
            }
        }
    }
    /**
     * 新闻
     * http://news.sina.com.cn/
     * 财经
     * http://finance.sina.com.cn/
     * 科技
     * http://tech.sina.com.cn/
     * 体育
     * http://sports.sina.com.cn/
     * 娱乐
     * http://ent.sina.com.cn/
     * 汽车
     * http://auto.sina.com.cn/
     * 博客
     * http://blog.sina.com.cn/
     * 视频
     * http://video.sina.com.cn/
     * 房产
     * http://www.leju.com/#source=pc_sina_tydh1&source_ext=pc_sina
     * 时尚
     * http://fashion.sina.com.cn/
     * 教育
     * http://edu.sina.com.cn/
     * 图片
     * http://photo.sina.com.cn/
     * 微博
     * https://weibo.com/
     * 旅游
     * http://travel.sina.com.cn/
     * 游戏
     * http://games.sina.com.cn/
     * */
}
