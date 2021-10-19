<template>
  <div>
    <table>
      <tr>
        <th>编号</th>
        <th>名字</th>
        <th>年龄</th>
      </tr>
      <tr v-for="item in users" :key="item.id">
        <td>{{item.id}}</td>
        <td>{{item.name}}</td>
        <td>{{item.pwd}}</td>
      </tr>
    </table>
  </div>
</template>

<script>
export default {
  name: 'user',
  data () {
    return {
      users: [

      ]
    }
  },
  created () {
    const _this = this
    this.axios.get('http://localhost:8088/user/queryList').then(function (resp) {
      _this.users = resp.data
    })
  }
}
</script>

<style scoped>

</style>
