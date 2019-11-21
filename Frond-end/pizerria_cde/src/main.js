import Vue from "vue";

import App from "./App.vue";
import VueRouter from "vue-router";
import Admin from './components/Admin';
import Home from './components/Home';

Vue.use(VueRouter);
// 1. Define route components.
// These can be imported from other files


// 2. Define some routes
// Each route should map to a component. The "component" can
// either be an actual component constructor created via
// `Vue.extend()`, or just a component options object.
// We'll talk about nested routes later.
const routes = [
  { path: "/Admin", component: Admin },
  { path: "/Home", component: Home }
];

// 3. Create the router instance and pass the `routes` option
// You can pass in additional options here, but let's
// keep it simple for now.
const router = new VueRouter({
  routes // short for `routes: routes`
});

Vue.config.productionTip = false;

new Vue({
  render: h => h(App),
  router
}).$mount("#app");
