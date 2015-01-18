# netbeans-bugs
Projects illustrating bugs in NetBeans

A collection of projects which demonstrate issues I have encountered in NetBeans.

# netbeans-templates-link-bug

Demonstrates that Facelets templates references are not hot linked like Facelets includes are.  Open the file index.xhtml in the project, hold Ctrl and hover over the value of the template attribute in the ui:composition tag.  Contrast with the same process for the src attribute of the ui:include tag.  See bug report https://netbeans.org/bugzilla/show_bug.cgi?id=249877

To get just this project, use the command:

svn export https://github.com/RayDeCampo/netbeans-bugs/trunk/netbeans-templates-link-bug

# jsf-outputScript-highlighting

Demonstrates lack of support for JavaScript within <h:outputScript> tags in NetBeans.  See bug report https://netbeans.org/bugzilla/show_bug.cgi?id=249884.

svn export https://github.com/RayDeCampo/netbeans-bugs/trunk/jsf-outputScript-highlightin
