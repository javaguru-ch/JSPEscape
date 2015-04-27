JSPEscape
=========

The simple way to bring commonly used escaping/encoding to JSP.
Escape special character in strings used for HTML, JavaScript, JSON and URL creation.

#Usage
1. Make sure the library is in your projects classpath (i.e. jspescape.jar is located in the directory <WEBAPP>/WEB-INF/lib).
2. Use the JSP functions in your JSP files as follows:
```
<%@ taglib prefix="enc" uri="https://github.com/javaguru-ch/JSPEscape" %>
...
${enc:HTML('Text to be <code>encoded</code>')}
```

#Example
The following JSP file demonstrates the functionality of JSPEscape:
```
<%@ page contentType="text/html; charset=UTF-8" %>
<%@ taglib prefix="enc" uri="https://github.com/javaguru-ch/JSPEscape" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<body>

<h1>HTML</h1>
<c:set var="onClick" value="alert(\"Hello World\")"/>
<span onclick="${enc:HTML(onClick)}">Click Me</span>

<h1>JavaScript</h1>
<c:set var="varContent" value="';alert('I\\'m not executed because I get escaped!');'"/>
<script>
    var myVar = '${enc:JS(varContent)}';
</script>

<h1>JSON</h1>
<c:set var="jsonContent" value="Before\", \"Inject\": \"Me"/>
<pre>
{
    "Key": "${enc:JSON(jsonContent)}"
}
</pre>

<h1>URL</h1>
<c:set var="url" value="http://www.domain.tld/some_file?some=params"/>
<a href="http://www.link.tld/?url=${enc:URL(url)}">A Link</a>

</body>
</html>
```
