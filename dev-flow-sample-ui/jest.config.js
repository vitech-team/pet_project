module.exports = {
    moduleNameMapper: {
        // Handle asset files such as stylesheets and images.
        // Usually, these files aren't particularly useful in tests so we can safely mock them out.
        "\\.(css|jpg|png)$": "<rootDir>/empty-module.js"
    },
    collectCoverage: true,
    coverageReporters: [
        "text",
        "cobertura"
    ],
    reporters: [
        "default",
        [ "jest-junit", { suiteName: "jest tests" } ]
    ]
};