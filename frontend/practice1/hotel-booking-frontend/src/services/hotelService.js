import api from "./api";

export const getAllHotels = async () => {
  try {
    const response = await api.get("/hotels");
    return response.data;
  } catch (error) {
    throw error;
  }
};

export const getHotelById = async (id) => {
  try {
    const response = await api.get(
      `/hotels/${id}`
    );

    return response.data;
  } catch (error) {
    throw error;
  }
};

export const searchHotels = async (
  city
) => {
  try {
    const response = await api.get(
      `/hotels/search?city=${city}`
    );

    return response.data;
  } catch (error) {
    throw error;
  }
};