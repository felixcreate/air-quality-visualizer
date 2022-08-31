## To run using maven:
Run the goal javafx:run

## To package:
 - Use the correct platform profile (windows or macos)
 - Run the goals clean and install (e.g. mvn clean install)
 - Example for windows: mvn clean install -P platform-windows

The packaged app and runtime should be in target/installer