import groovy.json.JsonOutput

def saveAsPrettyJson(data, filename) {
    // Convert to JSON and pretty-print
    def json = JsonOutput.prettyPrint(JsonOutput.toJson(data))
    // Write JSON to a file in the workspace
    new File(filename).write(json)
    echo "Saved JSON to ${filename}"
}