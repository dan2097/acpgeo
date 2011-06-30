package uk.ac.cam.ch.wwmm.acpgeo;

import junit.framework.Assert;

import org.junit.Test;

import uk.ac.cam.ch.wwmm.chemicaltagger.POSContainer;
import uk.ac.cam.ch.wwmm.chemicaltagger.Utils;

public class RecogniseConcentrationsTest {

	



	@Test
	public void testRecogniseConcentrations1() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = Utils.readSentence("uk/ac/cam/ch/wwmm/acpgeo/tagTest/testConcentration1.txt");
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),
				"target/Concentration1.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}

	@Test
	public void testRecogniseConcentrations2() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = Utils.readSentence("uk/ac/cam/ch/wwmm/acpgeo/tagTest/testConcentration2.txt");
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),
				"target/Concentration2.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}

	@Test
	public void testRecogniseConcentrations3() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		
		String sentence = Utils.readSentence("uk/ac/cam/ch/wwmm/acpgeo/tagTest/testConcentration3.txt");
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),
				"target/Concentration3.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}

	@Test
	public void testRecogniseConcentrations4() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = Utils.readSentence("uk/ac/cam/ch/wwmm/acpgeo/tagTest/testConcentration4.txt");
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),	"target/Concentration4.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}

	@Test
	public void testRecogniseConcentrations5() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = Utils.readSentence("uk/ac/cam/ch/wwmm/acpgeo/tagTest/testConcentration5.txt");
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),"target/Concentration5.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}
	
	@Test
	public void testRecogniseConcentrations6() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = Utils.readSentence("uk/ac/cam/ch/wwmm/acpgeo/tagTest/testConcentration6.txt");
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),"target/Concentration6.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}
	@Test
	public void testRecogniseConcentrations7() {
		ACPTagger acpTagger = ACPTagger.getInstance();
		String sentence = Utils.readSentence("uk/ac/cam/ch/wwmm/acpgeo/tagTest/testConcentration7.txt");
		sentence = Utils.cleanHTMLText(sentence);
		POSContainer posContainer = acpTagger.runTaggers(sentence);
		ACPSentenceParser sentenceParser = new ACPSentenceParser(posContainer);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),"target/Concentration7.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}
	
	
	@Test
	public void testRecogniseConcentrations8() {
		String taggedSentence = "DT-THE The NN contribution IN-OF of NN boundary NN-ACP layer -LRB- ( NN-ACP BL -RRB- ) IN nucleation NNS events TO to VB total NN-ACP particle NN-CONCENTRATE concentrations IN-ON on DT-THE the JJ global NN-ACP scale VBZ has VBN been VBN studied IN-BY by VBG including DT a JJ new JJ-ACP particle NN formation NN mechanism IN-IN in DT a JJ global NN-ACP aerosol NNS microphysics NN-ACP model STOP . DT-THE The NN mechanism VBZ is VBN based IN-ON on DT an NN analysis IN-OF of JJ extensive NNS observations IN-OF of NN-ACP particle NN formation IN-IN in DT-THE the NN-ACP BL IN at DT a JJ continental JJ-CHEM surface NN site STOP . PRP It VBZ assumes JJ that JJ molecular NNS clusters VBP form IN at DT a JJ-CHEM rate JJ proportional TO to DT-THE the NN-STATE gaseous OSCAR-CM sulfuric NN-ACP acid NN-CONCENTRATE concentration TO to DT-THE the NN power IN-OF of CD-ALPHANUM 1 STOP . DT-THE The JJ-CHEM formation NN rate IN-OF of CD 3 NN nm NN diameter JJ observable NNS particles VBZ is VBN controlled IN-BY by DT-THE the JJ-CHEM cluster NN formation NN rate CC and DT-THE the JJ existing NN-ACP particle NN surface NN area COMMA , WDT which VBZ acts TO to VB scavenge JJ condensable NN-STATE gases CC and NNS clusters IN during NN growth STOP . FW Modelled OSCAR-CM sulfuric NN-ACP acid NN vapour NN-CONCENTRATE concentrations COMMA , NN-ACP particle NN formation NNS rates COMMA , NN growth NNS rates COMMA , NN-ACP coagulation NN loss NNS rates COMMA , NN peak NN-ACP particle NN-CONCENTRATE concentrations COMMA , CC and DT-THE the RB daily NN timing IN-OF of NNS events IN-IN in DT-THE the JJ global NN-ACP model VBP agree RB well IN-WITH with NNS observations VBN made IN during DT a JJ 22-day NN-TIME period IN-OF of NNP-MONTH March CD-YEAR 2003 IN at DT-THE the NNP-ACRONYM SMEAR NNP II NN-STATION station IN-IN in NNP-STATION Hyytiälä COMMA , NNP Finland. DT-THE The NN nucleation NNS bursts VBP produce JJ total NN-ACP particle NN-CONCENTRATE concentrations -LRB- ( CD >3 NN nm NN diameter -RRB- ) RB often VBG exceeding CD 10^4 CD cm−3 COMMA , WDT which VBP are VBN sustained IN-FOR for DT a NN-TIME period IN-OF of JJ several NN-TIME hours IN around JJ local NN midday STOP . DT-THE The JJ predicted JJ global NN distribution IN-OF of NN-ACP particle NN formation NNS events RB broadly VBZ agrees IN-WITH with WP what VBZ is VBN expected IN-FROM from JJ available NN observations STOP . IN-OVER Over RB relatively JJ clean JJ remote JJ continental JJ-CHEM locations NN formation NNS events MD can VB sustain JJ-ACP mean JJ total NN-ACP particle NN-CONCENTRATE concentrations IN up TO to DT a NN factor IN-OF of CD 8 JJR greater IN than WP those JJ-CHEM resulting IN-FROM from JJ-ACP anthropogenic NNS sources IN-OF of JJ primary JJ-CHEM organic CC and JJ black OSCAR-CM carbon NNS particles STOP . RB However COMMA , IN-IN in JJ polluted JJ continental JJ-CHEM regions JJ-ACP anthropogenic JJ primary NNS particles VBP dominate NN-ACP particle NN number CC and NN formation NNS events VBP lead TO to JJR smaller NNS enhancements IN-OF of RB up TO to DT a NN factor IN-OF of CD-ALPHANUM 2 STOP . PRP$ Our VB-YIELD results RB-CONJ therefore VBP suggest JJ that NN-ACP particle NN-CONCENTRATE concentrations IN-IN in JJ remote JJ continental NNS regions VBP are VBN dominated IN-BY by JJ nucleated NNS particles IN while NN-CONCENTRATE concentrations IN-IN in JJ polluted JJ continental NNS regions VBP are VBN dominated IN-BY by JJ primary NN particles STOP . DT-THE The NN effect IN-OF of NN-ACP BL NN-ACP particle NN formation IN-OVER over JJ tropical NNS regions CC and DT-THE the NNP Amazon VBZ is JJ negligible STOP . DT These JJ first JJ global JJ-ACP particle NN formation NNS simulations VBP reveal DT some JJ interesting NN sensitivities STOP . PRP We VBP show COMMA , IN-FOR for NN-EXAMPLE example COMMA , JJ that JJ significant NNS reductions IN-IN in JJ primary NN-ACP particle NNS emissions MD may VB lead TO to DT an VB-INCREASE increase IN-IN in JJ total NN-ACP particle NN-CONCENTRATE concentration IN because IN-OF of DT-THE the NN coupling IN between NN-ACP particle NN surface NN area CC and DT-THE the NN rate IN-OF of JJ new JJ-ACP particle NN formation STOP . DT This NN-CHEMENTITY result VBZ suggests JJ that NNS changes IN-IN in NNS emissions MD may VB have DT a JJ complicated NN effect IN-ON on JJ global CC and JJ regional NN-ACP aerosol NNS properties STOP . RB Overall COMMA , PRP$ our VB-YIELD results VBP show JJ that JJ new JJ-ACP particle NN formation VBZ is DT a JJ significant NN component IN-OF of DT-THE the JJ-ACP aerosol JJ-ACP particle NN number NN budget STOP .";
		ACPSentenceParser sentenceParser = new ACPSentenceParser(taggedSentence);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),"target/Concentration8.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}

	@Test
	public void testRecogniseConcentrations9() {
		String taggedSentence = "IN Throughout DT-THE the NN year CD-YEAR 2001 COMMA , NN-ACP aerosol NNS samples VBD were VB-RECOVER collected RB continuously IN-FOR for CD 10 TO to CD 15 NN-TIME days IN at DT-THE the NNP-COUNTRY French NNP Antarctic NNP Station NNP-STATION Dumont NNP-STATION d'Urville -LRB- ( NNP-ACRONYM DDU -RRB- ) -LRB- ( CD-DEGREES 66°40' NNP-DIRECTION S COMMA , CD-DEGREES 40°0' NNP-DIRECTION E COMMA , CD 40 NN-METER m IN above JJ-ACP mean JJ-CHEM sea NN level -RRB- ) STOP . DT-THE The OSCAR-CM nitrogen CC and OSCAR-CM oxygen JJ isotopic NNS ratios IN-OF of NN particulate OSCAR-CM nitrate IN at NNP-ACRONYM DDU NN exhibit JJ seasonal JJ-CHEM variations JJ that VBP are IN among DT-THE the RBS most JJ extreme VB-OBSERVE observed IN-FOR for OSCAR-CM nitrate IN-ON on NNP Earth. IN-IN In NN association IN-WITH with NN-CONCENTRATE concentration NN-MEASUREMENT measurements COMMA , DT-THE the NN isotope NNS ratios VBP delineate CD four JJ distinct NN-TIME periods COMMA , RB broadly JJ consistent IN-WITH with JJ previous NNS studies IN-ON on NNP Antarctic JJ coastal NN areas STOP . IN During JJ austral NN autumn CC and RB early NN winter -LRB- ( NNP-MONTH March TO to RB mid-July -RRB- ) COMMA , OSCAR-CM nitrate NN-CONCENTRATE concentrations VB attain DT a NN minimum IN between CD 10 CC and CD 30 NN ng OSCAR-CM m−3 -LRB- ( VBN referred TO to IN-AS as NN-TIME Period CD 2 -RRB- ) STOP . CD Two JJ local NN maxima IN-IN in NNP-MONTH August -LRB- ( CD 55 NN ng OSCAR-CM m−3 -RRB- ) CC and NNP-MONTH November/December -LRB- ( CD 165 JJ ng OSCAR-CM m−3 -RRB- ) VBP are VBN used TO to VB assign NN-TIME Period CD-ALPHANUM 3 -LRB- ( RB mid-July TO to NNP-MONTH September -RRB- ) CC and NN-TIME Period CD-ALPHANUM 4 -LRB- ( NNP-MONTH October TO to NNP-MONTH December -RRB- ) STOP . NN-TIME Period CD-ALPHANUM 1 -LRB- ( NNP-MONTH January TO to NNP-MONTH March -RRB- ) VBZ is DT a NN transition NN-TIME period IN between DT-THE the JJ maximum NN-CONCENTRATE concentration IN-OF of NN-TIME Period CD 4 CC and DT-THE the NN background NN concentration IN-OF of NN-TIME Period CD-ALPHANUM 2 STOP . DT These JJ seasonal NNS changes VBP are VBN reflected IN-IN in NNS changes IN-OF of DT-THE the OSCAR-CM nitrogen CC and OSCAR-CM oxygen VBP isotope NNS ratios STOP . IN During NN-TIME Period CD-ALPHANUM 2 COMMA , WDT which VBZ is VBN characterized IN-BY by NN background NN-CONCENTRATE concentrations COMMA , DT-THE the NN isotope NNS ratios VBP are IN-IN in DT-THE the NN range IN-OF of JJ previous NN-MEASUREMENT measurements IN at NNS-ACP mid-latitudes COLON : JJ δ18Ovsmow=(77.2±8.6)‰ STOP ; : Δ17O=(29.8±4.4)‰ STOP ; FW δ15Nair=(−4.4±5.4)‰ -LRB- ( NN-ACP mean SYM ± CD one JJ-ACP standard NN deviation -RRB- ) STOP . NN-TIME Period CD 3 VBZ is VBN accompanied IN-BY by DT a JJ significant VB-INCREASE increase IN-OF of DT-THE the OSCAR-CM oxygen NN isotope NNS ratios CC and DT a JJ small VB-INCREASE increase IN-OF of DT-THE the OSCAR-CM nitrogen NN isotope NN ratio TO to NN δ18Ovsmow=(98.8±13.9)‰ STOP ; NNP Δ17O=(38.8±4.7)‰ CC and NNP δ15Nair=(4.3±8.20‰) STOP . NN-TIME Period CD 4 VBZ is VBN characterized IN-BY by DT a JJ minimum OSCAR-CM 15N/14N NN ratio COMMA , RB only VBN matched IN-BY by CD one RB-CONJ prior NN study IN-OF of NNP Antarctic NNS aerosols COMMA , CC and OSCAR-CM oxygen VBP isotope NNS ratios JJ similar TO to NN-TIME Period CD 2 COLON : NN δ18Ovsmow=(77.2±7.7)‰ STOP ; : Δ17O=(31.1±3.2)‰ STOP ; NNP δ15Nair=(−32.7±8.4)‰ STOP . RB Finally COMMA , IN during NN-TIME Period CD-ALPHANUM 1 COMMA , JJ isotope NNS ratios VBP reach JJ minimum NNS values IN-FOR for OSCAR-CM oxygen CC and JJ intermediate NNS values IN-FOR for OSCAR-CM nitrogen COLON : JJ δ18Ovsmow=63.2±2.5‰ STOP ; : Δ17O=24.0±1.1‰ STOP ; JJ δ15Nair=−17.9±4.0‰ -RRB- ) STOP . VBN Based IN-ON on DT-THE the JJ measured JJ isotopic NN composition COMMA , VBN known JJ atmospheric NN transport NNS patterns CC and DT-THE the JJ current VB-DEGASS understanding IN-OF of NNS-ACP kinetics CC and VBP isotope NNS effects IN-OF of JJ relevant JJ atmospheric NN chemical NNS processes COMMA , PRP we VBP suggest JJ that JJ elevated NN tropospheric OSCAR-CM nitrate NNS levels IN during NN-TIME Period CD 3 VBP are RBS most NN-ACP likely DT-THE the VB-YIELD result IN-OF of OSCAR-CM nitrate NN-ACP sedimentation IN-FROM from JJ polar JJ stratospheric NNS clouds -LRB- ( NNP-ACRONYM PSCs -RRB- ) COMMA , IN whereas VBN elevated OSCAR-CM nitrate NNS levels IN during NN-TIME Period CD 4 VBP are NN-ACP likely TO to VB-YIELD result IN-FROM from NN-ACP snow NN re-emission IN-OF of OSCAR-CM nitrogen OSCAR-CM oxide NNS-ACP species STOP . PRP We VBP are JJ unable TO to VB attribute DT-THE the NN-ACP source IN-OF of DT-THE the NN nitrate IN during NN-TIME periods CD 1 CC and CD 2 TO to JJ local NN production CC or JJ long-range NN transport COMMA , CC but NN note JJ that DT-THE the JJ-CHEM oxygen NN isotopic NN composition VBZ is IN-IN in NN agreement IN-WITH with NN day CC and NN-TIME night NN-TIME time OSCAR-CM nitrate NN chemistry VBN driven IN-BY by DT-THE the JJ-ACP diurnal JJ solar NN-CYCLE cycle STOP . DT A JJ precise NN quantification VBZ is JJ difficult COMMA , JJ due TO to PRP$ our JJ insufficient NN knowledge IN-OF of NN isotope NN fractionation IN during DT-THE the NNS reactions VBG leading TO to OSCAR-CM nitrate NN formation COMMA , IN among JJ other NN reasons STOP .";

		ACPSentenceParser sentenceParser = new ACPSentenceParser(taggedSentence);
		sentenceParser.parseTags();
		Utils.writeXMLToFile(sentenceParser.makeXMLDocument(),"target/Concentration9.xml");
		Assert.assertTrue("Error-free parse", !sentenceParser.getParseTree()
				.toStringTree().contains("<error"));

	}
	
	
	}