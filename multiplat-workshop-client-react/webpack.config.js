var webpack = require("webpack");
var path = require("path");

module.exports = {
  entry: path.resolve(__dirname, "build/kotlin-js-min/main/multiplat-workshop-client-react.js"),
  output: {
    path: path.resolve(__dirname, "build"),
    filename: "bundle.js"
  },
  resolve: {
    modules : [
      "node_modules",
      path.resolve(__dirname, "build/kotlin-js-min/main/")
    ]
  },
  plugins: [
    new webpack.optimize.UglifyJsPlugin()
  ]
};