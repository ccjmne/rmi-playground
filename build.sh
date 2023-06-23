# Compile Java
rm -rf out && mkdir out
javac -d ./out src/*.java

# Package into a JAR
cd out
jar cvf Server.jar *
jar cfe Server.jar src/Server *
