import api from "./api";

export const loginUser = async (credentials) => {
  try {
    const response = await api.post(
      "/auth/login",
      credentials
    );

    return response.data;
  } catch (error) {
    throw error;
  }
};

export const registerUser = async (userData) => {
  try {
    const response = await api.post(
      "/auth/register",
      userData
    );

    return response.data;
  } catch (error) {
    throw error;
  }
};

export const logoutUser = () => {
  localStorage.removeItem("token");
  localStorage.removeItem("user");
};