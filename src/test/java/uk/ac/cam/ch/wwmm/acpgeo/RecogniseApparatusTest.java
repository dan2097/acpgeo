package uk.ac.cam.ch.wwmm.acpgeo;

import junit.framework.Assert;
import nu.xom.Document;

import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.Formatter;
import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

public class RecogniseApparatusTest {

	
	  
	@Test
	public void recogniseInstrument() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = "FTIR, FT-IR, GCxGC, GC-MS, FAGE, AMS and DOAS are instrumental techniques used within atmospheric chemistry.";
		sentence = Utils.cleanHTMLText(sentence);
		sentence = Formatter.normaliseText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
        Assert.assertEquals("NNP-APPARATUS FTIR COMMA , NNP-APPARATUS FT-IR COMMA , NNP-APPARATUS GCxGC COMMA , NNP-APPARATUS GC-MS COMMA , NNP-APPARATUS FAGE COMMA , NNP-APPARATUS AMS CC and NNP-APPARATUS DOAS VBP are JJ instrumental NN-METHOD techniques VBN used IN within JJ atmospheric NN chemistry STOP ." , posContainer.getTokenTagTupleAsString());
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		Utils.writeXMLToFile(doc,
				"target/Apparatus1.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));
	}

	@Test
	public void recogniseHyphenedInstrument() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = "ERS-2/GOME and DOAS are instrumental techniques used within atmospheric chemistry.";
		sentence = Utils.cleanHTMLText(sentence);
		sentence = Formatter.normaliseText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
        Assert.assertEquals("NNP-APPARATUS ERS-2/GOME CC and NNP-APPARATUS DOAS VBP are JJ instrumental NN-METHOD techniques VBN used IN within JJ atmospheric NN chemistry STOP ." , posContainer.getTokenTagTupleAsString());
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Document doc = sentenceParser.makeXMLDocument();
		Utils.writeXMLToFile(doc,
				"target/Apparatus2.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));
	}

	}