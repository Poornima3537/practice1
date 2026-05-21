import api from "./api";

export const createBooking = async (
  bookingData
) => {
  try {
    const response = await api.post(
      "/bookings",
      bookingData
    );

    return response.data;
  } catch (error) {
    throw error;
  }
};

export const getUserBookings =
  async () => {
    try {
      const response = await api.get(
        "/bookings/user"
      );

      return response.data;
    } catch (error) {
      throw error;
    }
  };

export const cancelBooking = async (
  bookingId
) => {
  try {
    const response = await api.delete(
      `/bookings/${bookingId}`
    );

    return response.data;
  } catch (error) {
    throw error;
  }
};