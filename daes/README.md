# Exchanging Data    Agreements in the DaaS Model

## Paper
* Hong-Linh Truong, Schahram Dustdar, Joachim Goetze, Tino Fleuren, Paul  Mueller, Salah-Eddine Tbahriti, Michael Mrissa, Chirine   Ghedira, <b>Exchanging Data Agreements in the DaaS Model</b> (<a
      href="https://users.aalto.fi/~truongh4/publications/2011/truong-daes2011-submitted.pdf">Submitted PDF</a>), Submitted to  <a href="http://www.ftrai.org/apscc2011/">The 2011 Asia-Pacific Services Computing Conference (IEEE APSCC 2011)</a>.

## Prototype

* Metamodel for encapsulating data agreements:
<a href="schemas/DataAgreement.xsd">XML Schema</a>
* Here are examples to demonstrate DEAS with geodata.
   - When accessing DAES with <b> GET
	    http://SERVER_DOWN/services/jersey/DAES/da/retrieve/wcs-da1</b>, DAES will return <a href="samples/wcs-da1.xml">this metadata</a>.
      - Using the agreement reference
	  (<b>http://sod.infosys.tuwien.ac.at:7101/services/jersey/DAES/da/references/retrieve/license_wcs</b>) to access the agreement, DAES will return <a href="samples/license_wcs.xml">this agreement</a>.
    * Test with Data Agreement App:   Run
      <b>http://SERVER_DOWN/services/jersey/DAES/da/daapp?app=RDF-Policy-Twitter-Mashup-CompApp&id1=twitterpolicy1&id2=twitterpolicy2&reference=true</b> will return <a href="samples/compatibility.xml">this result</a>.
