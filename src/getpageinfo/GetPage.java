package getpageinfo;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.io.IOException;

public class GetPage {
    public static void main(String[] args) throws IOException {
        String url = "http://www.lietu.com/";
        Document doc = Jsoup.connect(url).get();    // 解析的结果就是一个文档对象
        Elements links = doc.select("a[href]");    // 获取多有的连接节点
        for (Element link : links) {                // 遍历每个链接，集合里面的每一个元素写在前面
            String linkHref = link.attr("href");    // 得到 href 属性中的值，也就是 URL 地址
            System.out.println(linkHref);           // 输出 URL 地址
            // 得到的 url 地址都是相对地址
        }
    }
}
