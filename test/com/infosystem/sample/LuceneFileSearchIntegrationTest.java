package com.infosystem.sample;

import java.io.IOException;
import java.net.URISyntaxException;
import java.nio.file.Paths;
import java.util.List;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.custom.CustomAnalyzer;
import org.apache.lucene.analysis.standard.StandardAnalyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.store.Directory;
import org.apache.lucene.store.FSDirectory;
import org.junit.Assert;
import org.junit.Test;

public class LuceneFileSearchIntegrationTest {

    @Test
    public void givenSearchQueryWhenFetchedFileNamehenCorrect() throws IOException, URISyntaxException {
        String indexPath = "index";
        String dataPath = "//Users//maneendraperera//Documents//OVGUWorkspace//InformationRetreivalSystem//test//file1.txt";
        Analyzer analyzer = CustomAnalyzer.builder().withTokenizer("standard").addTokenFilter("porterstem").build();

        Directory directory = FSDirectory.open(Paths.get(indexPath));
        //LuceneFileSearch luceneFileSearch = new LuceneFileSearch(directory, new StandardAnalyzer());

        LuceneFileSearch luceneFileSearch = new LuceneFileSearch(directory, analyzer);
        luceneFileSearch.addFileToIndex(dataPath);

        List<Document> docs = luceneFileSearch.searchFiles("contents", "consectetur");

        Assert.assertEquals("file1.txt", docs.get(0).get("filename"));
    }

}