import { GET_AUTOS } from "../types";

const initialState = [];

export default function (state = initialState, action) {
  const { type, payload } = action;

  switch (type) {
    case GET_AUTOS:
      return [...payload];

    default:
      return state;
  }
}
