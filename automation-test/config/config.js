

const config = {
  development: {
    base_uri: "http://localhost:8080"

  },
  production: {
    base_uri: "http://localhost:8080"
  }
};

exports.get = function get(env) {
  return config[env] || config.development;
};
