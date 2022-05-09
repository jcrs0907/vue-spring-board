const { defineConfig } = require("@vue/cli-service");
module.exports = defineConfig({
  transpileDependencies: true,
  //outputDir : npm run build로 빌드 시에 파일이 생성되는 위치
   outputDir: '../main/resources/static',
   devServer: {
          port: 3000,
          proxy: {
              '/api': { //api로 들어오면 포트 8080로 보냄
                  target: 'http://localhost:8080',
                  ws: true,
                  changeOrigin: true //cross origin 허용
              }
          },
      },
      //eslint 설정 끄기
      lintOnSave: false
});
