node {
    // Load the jsonUtils.groovy script
    def jsonUtils = load 'jsonUtils.groovy'

    // Define the pipeline structure as a Groovy map
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

    // Use the utility function from jsonUtils to save JSON in a separate file
    jsonUtils.saveAsPrettyJson(jenkinsfileStructure, 'jenkinsfile_structure.json')
}
