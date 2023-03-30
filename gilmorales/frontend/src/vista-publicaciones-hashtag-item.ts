import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';

@customElement('vista-publicaciones-hashtag-item')
export class VistaPublicacionesHashtagItem extends LitElement {
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
<vaadin-horizontal-layout class="content" style="width: 100%;" id="layoutItem" theme="spacing">
 <vaadin-vertical-layout theme="spacing" id="imagenPublicacion"></vaadin-vertical-layout>
 <vaadin-vertical-layout id="vaadinVerticalLayout" style="justify-content: center;">
  <vaadin-button theme="tertiary" id="botonNombreUsuario">
   NombreUsuario
  </vaadin-button>
  <label id="descripcion" style="flex-grow: 0; width: 100%;">Label</label>
 </vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
