<<<<<<< HEAD
const merge = require('webpack-merge');
const common = require('./webpack.common.js');

module.exports = merge(common, {
   mode: 'development',
   devtool: 'inline-source-map',
   performance: {hints: "warning"}
=======
const merge = require('webpack-merge');
const common = require('./webpack.common.js');

module.exports = merge(common, {
   mode: 'development',
   devtool: 'inline-source-map',
   performance: {hints: "warning"}
>>>>>>> branch 'master' of https://glcgitlab.southindia.cloudapp.azure.com/playground/Dec-2020/projects/aem/o2-store/O2Store_Project.git
});