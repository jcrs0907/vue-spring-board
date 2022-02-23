const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
   outputDir: '../main/resources/static', //빌드 타겟 디렉토리
   devServer: {
          port: 3000,
          proxy: {
              '/api': { //api로 들어오면 포트 8082로 보냄
                  target: 'http://localhost:8082',
                  ws: true,
                  changeOrigin: true //cross origin 허용
              }
          }
      },
});
