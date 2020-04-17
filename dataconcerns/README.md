
# Concerns for Data-as-a-Service (DaaS)

## Introduction
Providing data as a service has not only fostered the access to data from anywhere at anytime but also reduced the cost of investment. However, data is often associated with various concerns that must be explicitly described and modeled in order to ensure that the data consumer can find and select relevant data services as well as utilize the data in a right way. In particular, the use of data is bound to various rules imposed by data owners and regulators. Although, technically Web services and database technologies allow us to quickly expose data sources as Web services, until now, research has not been focused on the description of data service concerns, thus hindering the application of data services. In this work, we analyze major concerns for data as a service and discuss how these concerns can be used to improve the search and utilization of data services.

 ## Related documents
* Hong-Linh Truong, Schahram Dustdar "<b>On Evaluating and
      Publishing Data Concerns for Data as a Service</b>" (<a
      href="https://users.aalto.fi/~truongh4/publications/2010/td-apscc2010-submitted.pdf">Submitted PDF</a>, <a
      href="http://www.infosys.tuwien.ac.at/prototyp/SOD1/dataconcerns/dcevaluation.html">Supplement Materials</a>, <a href="http://apscc2010.hdu.edu.cn/APSCC_home.html">The 2010 Asia-Pacific Services Computing Conference (IEEE APSCC 2010)</a>, (c) IEEE, December 6 - 10, 2010, Hangzhou, China

* Michael Mrissa, Salah-Eddine Tbahriti, Hong-Linh Truong, "<b>Privacy model  and annotation for DaaS</b>" (<a  href="http://www.infosys.tuwien.ac.at/staff/truong/publications/2010/truong-daaspri-ecows2010.pdf">Submitted PDF</a>, <a  href="http://liris.cnrs.fr/~mmrissa/doku.php?id=demos">Supplement Material</a>), <a href="http://www.cs.ucy.ac.cy/ecows10/">The  8th European Conference on Web Services (ECOWS 2010)</a>, (c)IEEE  Computer Society, 1-3 December, 2010, Ayia Napa Cyprus.
* Hong-Linh Truong, Schahram Dustdar "<b>On Analyzing and Specifying Concerns for Data as a Service</b>" (<a href="http://www.infosys.tuwien.ac.at/staff/truong/publications/2009/truong-apscc09.pdf">Submitted PDF</a>, <a href="http://www.infosys.tuwien.ac.at/staff/truong/publications/2009/daas-apscc-09-slides.pdf">Slides</a>), <a href="http://apscc09.i2r.a-star.edu.sg/">The 2009 Asia-Pacific Services Computing Conference (IEEE APSCC 2009)</a>, December 7-11, 2009, Biopolis, Singapore.

## Prototypes
* <a href="../software/dataconcerns/daasconcern-v0.1.xsd">DaaS XML Schema, Version 0.1</a>
* Some extracted data models: <a href="samples/daasconcern-top-v0.1.jpg">DaaS top class</a>, <a href="samples/daasconcern-capability-v0.1.jpg">DaaS Capability</a>, <a href="samples/daasconcern-qod-v0.1.jpg"> DaaS QoD</a>
* Examples of concern description: <a href="samples/USAddressVerificationConcerns.xml">Concerns in XML</a></li>
* Linking DaaS's concerns and service interface using <a
	    href="http://www.infosys.tuwien.ac.at/autocompwiki/index.php/Service_Management">SEMF</a>: <a href="samples/strikeiron-concerns-semf-sample-feed.xml"> in Atom Feed</a>, <a href="samples/strikeiron-concerns-semf-sample.xml"> in normal XML</a>
* <a href="../software/dataconcerns/dcp-v0.1.xsd">DCP XSD Schema 	    Version 1</a>
* <a href="dcevaluation.md">Examples of concern  evaluation</a>
* <a href="../software/daasprivacy/daasprivacy.rdf">DaaS Privacy Schema</a>
