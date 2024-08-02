This repo is some rough idea for how to avoid needing a plugin itself compiling against implementations (and instead just some very barebones interfaces)

run

`./gradlew  --rerun-tasks --include-build ../gradle-plugin-with-deps thrillTask`
