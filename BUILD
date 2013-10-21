// Empty build file
[
{ "proto_library": {
    "name": "my_proto",
    "sources": [ "my_proto.proto" ],
    "generate_java": true
} },
{ "java_library": {
    "name": "parser",
    "java_sources": [ "Parser.java" ],
    "dependencies": [ ":my_proto" ]
} },
{ "java_binary": {
    "name": "checker",
    "java_sources": [ "Checker.java" ],
    "dependencies": [ ":parser" ]
} }
]