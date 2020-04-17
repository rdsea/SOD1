# Evaluating and Publishing Data Concerns for Data-as-a-Service (DaaS)

## Paper
* Hong-Linh Truong, Schahram Dustdar "<b>On Evaluating and       Publishing Data Concerns for Data as a Service</b>" (<a      href="https://users.aalto.fi/~truongh4/publications/2010/td-apscc2010-submitted.pdf">Submitted PDF</a>, <a   href="http://www.infosys.tuwien.ac.at/prototyp/SOD1/dataconcerns/dcevaluation.html">Supplement Materials</a>, <a href="http://apscc2010.hdu.edu.cn/APSCC_home.html">The 2010 Asia-Pacific Services Computing Conference (IEEE APSCC 2010)</a>, (c) IEEE, December 6 - 10, 2010, Hangzhou, China

## Supplement materials

Here are two simple examples to demonstrate the relationship
	  between the DaaS data provider and DaaS service provider in
	  the development of DaaS:

* The DaaS data provider is also the DaaS service provider by
	  writing a custom RESTful DaaS using Netbeans to handle the
	  Googleflu data. This also shows a simple way of mapping DaaS
	service operation parameters to query languages: <a
	    href="samples/dcevaluation/GoogleFluTrendResource.java">Simple Java example</a> which would return the <a href="samples/dcevaluation/Austria.json">following result for a call of <b>http://localhost:8080/resources/googleFluTrends/Austria</b></a></li>

* The DaaS data provider has a tightly coupled relationship with the
	  DaaS provider as a case of using WSO2 Data Service to expose
	  some dataset into DaaS: <a
	    href="samples/dcevaluation/wso2example.png">Using UI to define interfaces
	    and data mapping </a></li>

Here are three examples to demonstrate the evaluation and publishing
	of data concerns with <a href="http://www.undata-api.org/">the Adult literacy rate percent data set
	of the UNDataAPI</a>:

* Without specifying any QoD request, a call of our test service:
	  <b>http://localhost:8080/concernsmodels/resources/undata/Adult_literacy_rate_percent</b> will return <a href="samples/dcevaluation/Adult_literacy_rate_percent.xml">the following result</a> (which is the same data provided by the UNDataAPI).
* By querying only QoD metrics through a call of our test service:
	  <b>http://localhost:8080/concernsmodels/resources/undata/Adult_literacy_rate_percent?QoD</b>, the QoD metrics are evaluated on the fly and the data consumer will receive <a href="samples/dcevaluation/Adult_literacy_rate_percent-QoDonly.xml">the following result</a>. The QoD metrics are described using <a href="../software/dataconcerns/crq-quality.xsd">a custom QoD schema </a> based on <a href="index.html">the data concern analysis work</a>.</li>
* Through a call of our test service:
	  <b>http://localhost:8080/concernsmodels/resources/undata/Adult_literacy_rate_percent?QoD=annotation</b>, QoD metrics will be evaluated and annotated with the data as shown in <a href="samples/dcevaluation/Adult_literacy_rate_percent-withannotatedQoDmetrics.xml">the following result</a>.

The common data concern publishing (DCP) specification is an example of howto publish data concerns with services, service operations and
	data resources. In principle, we allow any data concern model
	to be included.

* <a href="../software/dataconcerns/dcp-v0.1.xsd">DCP XSD Schema 	    Version 1</a></li>
* Samples of DCP for the datasets
	     <a href="samples/dcevaluation/dcp-example.xml">Adult literacy rate</a> and  <a href="samples/dcevaluation/dcp-example2.xml">Population annual growth rate</a>
	    of the UNData APIs

Note that one can use this specification with their own service
      registries or Atom feeds. Other approaches could use it together
      with WSDL, SAWSDL, hREST, etc.
