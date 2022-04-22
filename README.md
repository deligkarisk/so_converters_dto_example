# Using conversion service in a converter
This small demo shows how to use a conversion service in a custom converter.
The issue we have when we want to do something like that is that the conversion service is null when autowired,
unless injected lazily (i.e. with the @Lazy annotation).

This was used to answer the following question on [stack overflow](https://stackoverflow.com/questions/71946285/spring-boot-entity-to-dto-converternotfoundexception/71950472#71950472).
