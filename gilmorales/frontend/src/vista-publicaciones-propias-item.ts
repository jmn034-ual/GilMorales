import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-checkbox/src/vaadin-checkbox.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-publicaciones-propias-item')
export class VistaPublicacionesPropiasItem extends LitElement {
  static get styles() {
    return css`
      :host {
          display: block;
          height: 100%;
      }
      `;
  }

   render() {
    return html`
<vaadin-vertical-layout id="layoutItem">
 <vaadin-vertical-layout id="layoutPublicacion" style="flex-grow: 0; overflow: hidden; flex-shrink: 0; width: 500px;  background-color: black; color: white;    border-radius: 10px;box-shadow: 5px 5px 15px rgba(0, 0, 0, 0.2);">
  <vaadin-vertical-layout id="layoutVideo" style="align-self: center; flex-grow: 0; flex-shrink: 0; display: flex; justify-content: center; align-items: center; overflow: hidden; height: 700px; background-color: black; width: 100%;"></vaadin-vertical-layout>
  <label id="numVisualizaciones" style="padding-left: var(--lumo-space-l);">0</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
