<template>
  <div id="app">
    <Header />
    <HelloWorld msg="Welcome to Your Vue.js App"/>
    <Footer />
   </div>
</template>

<script>
import Header from './components/Header.vue'
import HelloWorld from './components/HelloWorld.vue'
import Footer from './components/Footer.vue'

export default {
  name: 'App',
  components: {
    Header
    ,HelloWorld
    ,Footer
  }
}
</script>

<style>
#app {
  font-family: Avenir, Helvetica, Arial, sans-serif;
  -webkit-font-smoothing: antialiased;
  -moz-osx-font-smoothing: grayscale;
  text-align: center;
  color: #2c3e50;
  margin-top: 60px;
}
</style>
