@Library('jsonUtils') _  // Load the shared library
node {
    // Define pipeline structure as Groovy map
    def jenkinsfileStructure = [
        pipeline: [
            agent: "any",
            stages: [
                [
                    name: "Build",
                    steps: [
                        [name: "Checkout", action: "Checkout code from repository"],
                        [name: "Build project", action: "Run Maven build"]
                    ]
                ],
                [
                    name: "Test",
                    steps: [
                        [name: "Run tests", action: "Execute unit tests"]
                    ]
                ]
            ]
        ]
    ]

    // Use the utility function to save JSON in a separate file
    jsonUtils.saveAsPrettyJson(jenkinsfileStructure, 'jenkinsfile_structure.json')
}