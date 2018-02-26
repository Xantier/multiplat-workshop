var webpack = require("webpack");
var path = require("path");

module.exports = {
  entry: path.resolve(__dirname, "build/kotlin-js-min/main/multiplat-workshop-client-react.js"),
  output: {
    path: path.resolve(__dirname, "build"),
    filename: "bundle.js"
  },
  resolve: {
    alias: {
      kotlin: path.resolve(__dirname, "build/kotlin-js-min/main/kotlin.js"),
      "multiplat-workshop-js": path.resolve(__dirname, "build/kotlin-js-min/main/multiplat-workshop-js.js"),
      "kotlinx-coroutines-core-js": path.resolve(__dirname, "build/kotlin-js-min/main/kotlinx-coroutines-core-js.js"),
    }
  },
  plugins: [
    new webpack.optimize.UglifyJsPlugin()
  ]
};