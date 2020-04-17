# Context, Quality and Relevance: Dependencies and Impacts on   Web Services Design

## Overview
While several techniques have been introduced for specifying and ac-
quiring context and quality information associated with Web services, they consider such information representing the whole Web services. However, accessing to context and quality of resources provided by Web services is crucial. This is particularly relevant for data-intensive Web services of which the context and quality of resources will strongly impact on the service development and composition. In this work, we focus on studying  relationships among context, quality, and relevance, as well as their impact on the design and composition of
Web services, in particular for data-intensive services. Then, we will focus on the development of techniques to incorporate context and quality descriptions into service     APIs and RE services publishing.

 ## Paper
* Hong-Linh Truong, Marco Comerio, Andrea Maurino, Schahram Dustdar,
Flavio De Paoli and Luca Panziera "<b>On Identifying and Reducing Irrelevant Information in Service Composition and
Execution</b>" (<a href="https://users.aalto.fi/~truongh4/publications/2010/truong-wise10-submitted.pdf">Submitted     PDF</a>, <a href="http://siti-server01.siti.disco.unimib.it/itislab/research/experimental-results-and-prototypes/experiments-for-wise10/">Supplement Materials</a>), <a     href="http://conference.cs.cityu.edu.hk/wise2010/">The 11th      International Conference on Web Information System      Engineering(WISE 2010)</a>, (c)Springer-Velag, December 12-14, 2010, Hong Kong, China.
* Hong-Linh Truong, Schahram Dustdar, Andrea Maurino, Marco Comerio, "<b>Context, Quality and Relevance: Dependencies and Impacts on
  RESTful Web Services Design</b>" (<a
      href="http://www.infosys.tuwien.ac.at/staff/truong/publications/2010/tdmc-quacore-submitted-2010.pdf">Submitted PDF</a>,<a href="http://www.infosys.tuwien.ac.at/staff/truong/publications/2010/quacore-composableweb10-icwe-slides.pdf">Slides</a>, <a href="http://www.slideshare.net/linhsolar/context-quality-and-relevance-dependencies-and-impacts-on-restful-web-services-design">Slideshare.net</a>), <a href="http://mashart.org/composableweb2010/index.html">Second International Workshop on Lightweight Integration on the Web (CommposableWeb's 2010)</a>, ICWE 2010, (c)Springer-Verlag, July 5-9, 2010, Vienna, Austria.

# Examples
* Scenarios: <a href="figures/scenario-blank-var3-result.png">Search result without </a> context/quality  parameters,  <a href="figures/scenario-blank-var3-aware-result-short.png">Search result with </a>context/quality  parameters
* For the demonstration purpose, we provided customized quality and context models based on <a  href="../dataconcerns">the work on data concerns for data-as-a-service</a>
* Examples of context model: <a href="schemas/crq-context.xsd">XML    Schema</a>, <a href="schemas/crq-context.json">JSON</a>
* Examples of quality  model: <a href="schemas/crq-quality.xsd">XML 		Schema</a>, <a	href="schemas/crq-quality.json">JSON</a>
* Example of <a href="examples/GoogleFluTrend-v0.2.wadl">WADL with    context and quality of data specification</a>
