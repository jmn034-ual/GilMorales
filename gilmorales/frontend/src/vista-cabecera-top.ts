import { LitElement, html, css, customElement } from 'lit-element';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';
import '@vaadin/vaadin-button/src/vaadin-button.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

@customElement('vista-cabecera-top')
export class VistaCabeceraTop extends LitElement {
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
<vaadin-horizontal-layout id="vaadinHorizontalLayout" style="flex-grow: 1; width: 100%; height: 100%; overflow-y: auto;">
 <vaadin-vertical-layout id="cabeceraTop" style="flex-shrink: 1; flex-grow: 0; position: fixed; align-items: center; z-index: 99; margin-top: 4.2%; background-color: #C8C4C4; height: 100%; width: 10%; margin-left: 0; padding: 0%; justify-content: flex-start;">
  <h3 id="tituloUsuarios" style="align-self: center; z-index: 2;">Top Usuarios</h3>
  <vaadin-vertical-layout id="listaUsuarios" style="flex-grow: 0; z-index: 2; align-items: center; padding: 0%; margin: 0%;"></vaadin-vertical-layout>
  <vaadin-button id="botonVerListaUsuarios" style="align-self: center;z-index: 2; background-color: #ffffff;">
    Ver Lista Usuarios 
  </vaadin-button>
  <h3 style="align-self: center; z-index: 2; margin-top: 1px;" id="tituloHashtag">Top Hashtags</h3>
  <vaadin-vertical-layout style="align-self: center; flex-grow: 0; align-items: center; z-index: 2; justify-content: center; padding: 0%; margin: 0%;" id="listaTopHashtag"></vaadin-vertical-layout>
  <vaadin-button style="align-self: center;z-index: 2;background-color: #ffffff;" id="botonVerListaHashtag">
    Ver Lista Hashtags 
  </vaadin-button>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout id="layoutListaResultadoBusqueda" style="flex-grow: 1; margin: var(--lumo-space-xs); align-items: stretch; margin-left: 15%; flex-shrink: 0; overflow-y: auto;">
  <h2 id="tituloResultadoBusqueda" style="align-self: center; margin: var(--lumo-space-s);">Resultado de la Busqueda</h2>
  <vaadin-horizontal-layout id="vaadinHorizontalLayout2" style="align-self: stretch; justify-content: space-around; margin: var(--lumo-space-s);">
   <vaadin-horizontal-layout id="layoutTituloUsuarios" style="flex-grow: 0; justify-content: flex-start; flex-shrink: 0; margin-left: 15%;">
    <h3 id="tituloUsuarios">Usuarios</h3>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xs" id="layoutFiltrar" style="margin: var(--lumo-space-m); flex-grow: 0; justify-content: flex-end; width: 100%;"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout id="layoutListaResultadoUsuarios" style="margin: var(--lumo-space-s); justify-content: center; flex-shrink: 0; flex-grow: 1;"></vaadin-vertical-layout>
  <vaadin-horizontal-layout id="layoutTituloUsuarios" style="flex-grow: 0; justify-content: flex-start; margin: var(--lumo-space-s); align-self: stretch;">
   <vaadin-horizontal-layout id="layoutTituloHashtags" style="flex-grow: 0; justify-content: flex-start; flex-shrink: 0; margin-left: 14%;">
    <h3 id="tituloHashtags" style="flex-grow: 0; align-self: center;">Hashtags</h3>
   </vaadin-horizontal-layout>
   <vaadin-horizontal-layout theme="spacing-xs" id="vaadinHorizontalLayout3" style="flex-grow: 1; margin: var(--lumo-space-m); justify-content: flex-end; width: 100%;"></vaadin-horizontal-layout>
  </vaadin-horizontal-layout>
  <vaadin-vertical-layout style="align-self: stretch; margin: var(--lumo-space-s); justify-content: center; flex-shrink: 0; flex-grow: 1;" id="layoutListaResultadoHashtags"></vaadin-vertical-layout>
 </vaadin-vertical-layout>
 <vaadin-vertical-layout theme="spacing" id="layoutAyuda" style="flex-shrink: 0;"></vaadin-vertical-layout>
</vaadin-horizontal-layout>
`;
  }

  // Remove this method to render the contents of this view inside Shadow DOM
  createRenderRoot() {
    return this;
  }
}
