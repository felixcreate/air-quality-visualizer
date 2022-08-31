if [ "${OS_TYPE}" = "windows" ]
then
  "${JAVA_HOME}"/bin/jpackage.exe -t app-image --dest target/installer --name "Air Quality Data Packager" -m org.felixfb.airquality.exportedjsontoxlsx/org.felixfb.airquality.exportedjsontoxlsx.Start --java-options -Xmx2048m --runtime-image target/runtime --app-version "${PROJECT_VERSION}" --icon icons/icon.ico
elif [ "${OS_TYPE}" = "macos" ]
then
  "${JAVA_HOME}"/bin/jpackage -t app-image --dest target/installer --name "Air Quality Data Packager" -m org.felixfb.airquality.exportedjsontoxlsx/org.felixfb.airquality.exportedjsontoxlsx.Start --java-options -Xmx2048m --runtime-image target/runtime --app-version "${PROJECT_VERSION}" --icon icons/icon.icns --mac-package-name "Air Quality Data Packager"
fi
