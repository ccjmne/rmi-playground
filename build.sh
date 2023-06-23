# Compile source code
rm -rf out && mkdir -p out
javac -d out src/*.java

# Package into a JAR
cd out && jar cfe Server.jar src/Server *
