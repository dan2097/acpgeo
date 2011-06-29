package uk.ac.cam.ch.wwmm.acpgeo;

import junit.framework.Assert;

import nu.xom.Document;

import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

public class RecogniseCitationTest {

	@Test
	public void testRecogniseCitation() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = "( Flentje et al. , 2010 )";
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		Utils.writeXMLToFile(doc, "target/Citation1.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

		Assert.assertTrue("Found ReferencePhrase",
				doc.query("//ReferencePhrase").size() > 0);
		Assert.assertTrue("Not within a ParentheticalPhrase",
				doc.query("//ParentheticalPhrase").size() == 0);
	}

}