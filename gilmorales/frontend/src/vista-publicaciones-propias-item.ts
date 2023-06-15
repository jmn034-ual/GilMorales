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
<vaadin-vertical-layout style="width: 100%;" id="layoutItem">
 <vaadin-vertical-layout id="layoutPublicacion" style="align-self: center; flex-grow: 1;">
  <vaadin-vertical-layout id="layoutVideo" style="align-self: stretch;"></vaadin-vertical-layout>
  <label id="numVisualizaciones" style="align-self: flex-start;">0</label>
 </vaadin-vertical-layout>
</vaadin-vertical-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
