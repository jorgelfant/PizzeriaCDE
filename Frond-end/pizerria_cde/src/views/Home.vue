<template>
  <div>
    <h1>Home</h1>
  </div>
</template>

<script>
export default {
  name: "Home",
  props: {
    title: String
  },
  computed: {
    username() {
      // We will see what `params` is shortly
      return this.$route.params.username;
    }
  },
  methods: {
    goBack() {
      window.history.length > 1 ? this.$router.go(-1) : this.$router.push("/");
    }
  }
};
</script>

<style scoped></style>
